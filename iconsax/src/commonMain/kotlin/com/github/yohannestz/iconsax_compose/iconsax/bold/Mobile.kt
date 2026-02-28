package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mobile: ImageVector
    get() {
        val current = _mobile
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mobile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.24f, y = 2.0f)
                horizontalLineTo(x = 7.76f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 4.0f, y2 = 3.0f, x3 = 4.0f, y3 = 5.81f)
                verticalLineToRelative(dy = 12.38f)
                curveTo(x1 = 4.0f, y1 = 21.0f, x2 = 5.0f, y2 = 22.0f, x3 = 7.76f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.47f)
                curveTo(x1 = 19.0f, y1 = 22.0f, x2 = 20.0f, y2 = 21.0f, x3 = 20.0f, y3 = 18.19f)
                verticalLineTo(y = 5.81f)
                curveTo(x1 = 20.0f, y1 = 3.0f, x2 = 19.0f, y2 = 2.0f, x3 = 16.24f, y3 = 2.0f)
                moveTo(x = 12.0f, y = 19.3f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = -0.79f, dx3 = -1.75f, dy3 = -1.75f)
                reflectiveCurveTo(x1 = 11.04f, y1 = 15.8f, x2 = 12.0f, y2 = 15.8f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = 0.79f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveTo(x1 = 12.96f, y1 = 19.3f, x2 = 12.0f, y2 = 19.3f)
                moveToRelative(dx = 2.0f, dy = -13.05f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.59f, y1 = 4.75f, x2 = 10.0f, y2 = 4.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 14.41f, y1 = 6.25f, x2 = 14.0f, y2 = 6.25f)
            }
        }.build().also { _mobile = it }
    }

@Suppress("ObjectPropertyName")
private var _mobile: ImageVector? = null
