package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tree: ImageVector
    get() {
        val current = _tree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Tree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.17f, y = 10.06f)
                horizontalLineTo(x = 7.83f)
                curveToRelative(dx1 = -1.18f, dy1 = 0.0f, dx2 = -1.59f, dy2 = -0.79f, dx3 = -0.9f, dy3 = -1.75f)
                lineToRelative(dx = 4.17f, dy = -5.84f)
                curveToRelative(dx1 = 0.49f, dy1 = -0.7f, dx2 = 1.31f, dy2 = -0.7f, dx3 = 1.8f, dy3 = 0.0f)
                lineToRelative(dx = 4.17f, dy = 5.84f)
                curveToRelative(dx1 = 0.69f, dy1 = 0.96f, dx2 = 0.28f, dy2 = 1.75f, dx3 = -0.9f, dy3 = 1.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.59f, y = 18.0f)
                horizontalLineTo(x = 6.41f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.12f, dy2 = -1.05f, dx3 = -1.19f, dy3 = -2.33f)
                lineToRelative(dx = 3.99f, dy = -5.61f)
                horizontalLineToRelative(dx = 5.58f)
                lineToRelative(dx = 3.99f, dy = 5.6f)
                curveToRelative(dx1 = 0.93f, dy1 = 1.29f, dx2 = 0.39f, dy2 = 2.34f, dx3 = -1.19f, dy3 = 2.34f)
                moveToRelative(dx = -4.84f, dy = 0.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -4.0f)
                close()
            }
        }.build().also { _tree = it }
    }

@Suppress("ObjectPropertyName")
private var _tree: ImageVector? = null
