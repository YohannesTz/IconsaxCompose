package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignBottom: ImageVector
    get() {
        val current = _alignBottom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignBottom",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.02f, y = 4.62f)
                horizontalLineTo(x = 6.98f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = 0.6f, dx3 = -2.23f, dy3 = 2.12f)
                verticalLineToRelative(dy = 11.88f)
                horizontalLineToRelative(dx = 5.5f)
                verticalLineTo(y = 6.74f)
                curveTo(x1 = 10.24f, y1 = 5.22f, x2 = 9.6f, y2 = 4.62f, x3 = 8.02f, y3 = 4.62f)
                moveToRelative(dx = 8.5f, dy = 5.0f)
                horizontalLineToRelative(dx = -1.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = 0.61f, dx3 = -2.23f, dy3 = 2.12f)
                verticalLineToRelative(dy = 6.88f)
                horizontalLineToRelative(dx = 5.5f)
                verticalLineToRelative(dy = -6.88f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = -0.65f, dy2 = -2.12f, dx3 = -2.23f, dy3 = -2.12f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.75f, y = 17.88f)
                horizontalLineToRelative(dx = 18.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.34f, y1 = 19.38f, x2 = 2.0f, y2 = 19.04f, x3 = 2.0f, y3 = 18.62f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.74f, dx2 = 0.75f, dy2 = -0.74f)
            }
        }.build().also { _alignBottom = it }
    }

@Suppress("ObjectPropertyName")
private var _alignBottom: ImageVector? = null
