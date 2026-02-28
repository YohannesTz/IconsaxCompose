package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagTwo: ImageVector
    get() {
        val current = _flagTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlagTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.2f, y = 7.16f)
                lineToRelative(dx = -8.0f, dy = -3.46f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 7.2f, y1 = 2.34f, x2 = 6.86f, y2 = 2.0f, x3 = 6.45f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 5.7f, y1 = 2.34f, x2 = 5.7f, y2 = 2.75f)
                verticalLineToRelative(dy = 18.5f)
                curveTo(x1 = 5.7f, y1 = 21.66f, x2 = 6.04f, y2 = 22.0f, x3 = 6.45f, y3 = 22.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -3.96f)
                lineToRelative(dx = 8.22f, dy = -4.06f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 1.66f, dy1 = -0.86f, dx2 = 2.55f, dy2 = -1.97f, dx3 = 2.5f, dy3 = -3.14f)
                reflectiveCurveToRelative(dx1 = -1.02f, dy1 = -2.21f, dx2 = -2.73f, dy2 = -2.93f)
            }
        }.build().also { _flagTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _flagTwo: ImageVector? = null
