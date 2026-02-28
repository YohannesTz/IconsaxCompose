package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flag: ImageVector
    get() {
        val current = _flag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.02f, y = 12.33f)
                lineToRelative(dx = -1.22f, dy = -1.22f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = -1.03f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -1.23f)
                lineToRelative(dx = 1.2f, dy = -1.2f)
                curveToRelative(dx1 = 1.04f, dy1 = -1.04f, dx2 = 1.43f, dy2 = -2.04f, dx3 = 1.1f, dy3 = -2.83f)
                curveToRelative(dx1 = -0.32f, dy1 = -0.78f, dx2 = -1.31f, dy2 = -1.21f, dx3 = -2.77f, dy3 = -1.21f)
                horizontalLineTo(x = 5.9f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 5.9f, y1 = 2.34f, x2 = 5.56f, y2 = 2.0f, x3 = 5.15f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 4.4f, y1 = 2.34f, x2 = 4.4f, y2 = 2.75f)
                verticalLineToRelative(dy = 18.5f)
                curveTo(x1 = 4.4f, y1 = 21.66f, x2 = 4.74f, y2 = 22.0f, x3 = 5.15f, y3 = 22.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -4.88f)
                horizontalLineToRelative(dx = 10.45f)
                curveToRelative(dx1 = 1.44f, dy1 = 0.0f, dx2 = 2.41f, dy2 = -0.44f, dx3 = 2.74f, dy3 = -1.23f)
                reflectiveCurveToRelative(dx1 = -0.05f, dy1 = -1.78f, dx2 = -1.07f, dy2 = -2.81f)
            }
        }.build().also { _flag = it }
    }

@Suppress("ObjectPropertyName")
private var _flag: ImageVector? = null
