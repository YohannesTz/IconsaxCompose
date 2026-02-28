package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eye: ImageVector
    get() {
        val current = _eye
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eye",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.58f, y = 12.0f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -7.15f, dy1 = 0.0f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.15f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 20.27f)
                curveToRelative(dx1 = 3.53f, dy1 = 0.0f, dx2 = 6.82f, dy2 = -2.08f, dx3 = 9.11f, dy3 = -5.68f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.2f)
                curveTo(x1 = 18.82f, y1 = 5.8f, x2 = 15.53f, y2 = 3.73f, x3 = 12.0f, y3 = 3.73f)
                reflectiveCurveTo(x1 = 5.18f, y1 = 5.8f, x2 = 2.89f, y2 = 9.4f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.19f)
                curveToRelative(dx1 = 2.29f, dy1 = 3.6f, dx2 = 5.58f, dy2 = 5.68f, dx3 = 9.11f, dy3 = 5.68f)
            }
        }.build().also { _eye = it }
    }

@Suppress("ObjectPropertyName")
private var _eye: ImageVector? = null
