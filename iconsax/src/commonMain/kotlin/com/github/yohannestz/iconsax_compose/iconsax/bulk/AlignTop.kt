package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignTop: ImageVector
    get() {
        val current = _alignTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignTop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.98f, y = 19.38f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.12f)
                verticalLineTo(y = 5.38f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineToRelative(dy = 11.88f)
                curveToRelative(dx1 = 0.01f, dy1 = 1.52f, dx2 = 0.65f, dy2 = 2.12f, dx3 = 2.23f, dy3 = 2.12f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 7.48f, y = 14.38f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.61f, dx3 = 2.23f, dy3 = -2.12f)
                verticalLineTo(y = 5.38f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineToRelative(dy = 6.88f)
                curveToRelative(dx1 = 0.01f, dy1 = 1.5f, dx2 = 0.65f, dy2 = 2.12f, dx3 = 2.23f, dy3 = 2.12f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.25f, y = 6.12f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.34f, y1 = 6.12f, x2 = 2.0f, y2 = 5.79f, x3 = 2.0f, y3 = 5.38f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 18.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.74f, dx2 = -0.75f, dy2 = 0.74f)
            }
        }.build().also { _alignTop = it }
    }

@Suppress("ObjectPropertyName")
private var _alignTop: ImageVector? = null
