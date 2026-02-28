package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchZoomInOne: ImageVector
    get() {
        val current = _searchZoomInOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchZoomInOne",
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
                moveTo(x = 9.2f, y = 11.7f)
                horizontalLineToRelative(dx = 5.0f)
                moveToRelative(dx = -2.5f, dy = 2.5f)
                verticalLineToRelative(dy = -5.0f)
                moveTo(x = 11.5f, y = 2.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -4.3f, dy1 = 1.03f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
            }
        }.build().also { _searchZoomInOne = it }
    }

@Suppress("ObjectPropertyName")
private var _searchZoomInOne: ImageVector? = null
