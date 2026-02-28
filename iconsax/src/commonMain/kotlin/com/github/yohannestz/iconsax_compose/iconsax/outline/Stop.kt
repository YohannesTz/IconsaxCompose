package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stop: ImageVector
    get() {
        val current = _stop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.7f, y = 21.75f)
                horizontalLineTo(x = 9.3f)
                curveToRelative(dx1 = -4.94f, dy1 = 0.0f, dx2 = -7.05f, dy2 = -2.11f, dx3 = -7.05f, dy3 = -7.05f)
                verticalLineTo(y = 9.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.94f, dx2 = 2.11f, dy2 = -7.05f, dx3 = 7.05f, dy3 = -7.05f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 4.94f, dy1 = 0.0f, dx2 = 7.05f, dy2 = 2.11f, dx3 = 7.05f, dy3 = 7.05f)
                verticalLineToRelative(dy = 5.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.94f, dx2 = -2.11f, dy2 = 7.05f, dx3 = -7.05f, dy3 = 7.05f)
                moveToRelative(dx = -5.4f, dy = -18.0f)
                curveToRelative(dx1 = -4.1f, dy1 = 0.0f, dx2 = -5.55f, dy2 = 1.45f, dx3 = -5.55f, dy3 = 5.55f)
                verticalLineToRelative(dy = 5.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = 1.45f, dy2 = 5.55f, dx3 = 5.55f, dy3 = 5.55f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.55f, dy2 = -1.45f, dx3 = 5.55f, dy3 = -5.55f)
                verticalLineTo(y = 9.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.45f, dy2 = -5.55f, dx3 = -5.55f, dy3 = -5.55f)
                close()
            }
        }.build().also { _stop = it }
    }

@Suppress("ObjectPropertyName")
private var _stop: ImageVector? = null
