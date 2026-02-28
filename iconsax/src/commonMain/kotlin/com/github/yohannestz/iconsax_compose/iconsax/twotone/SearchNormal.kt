package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchNormal: ImageVector
    get() {
        val current = _searchNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchNormal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 20.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.93f, y = 20.69f)
                curveToRelative(dx1 = 0.53f, dy1 = 1.6f, dx2 = 1.74f, dy2 = 1.76f, dx3 = 2.67f, dy3 = 0.36f)
                curveToRelative(dx1 = 0.85f, dy1 = -1.28f, dx2 = 0.29f, dy2 = -2.33f, dx3 = -1.25f, dy3 = -2.33f)
                curveToRelative(dx1 = -1.14f, dy1 = -0.01f, dx2 = -1.78f, dy2 = 0.88f, dx3 = -1.42f, dy3 = 1.97f)
            }
        }.build().also { _searchNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _searchNormal: ImageVector? = null
