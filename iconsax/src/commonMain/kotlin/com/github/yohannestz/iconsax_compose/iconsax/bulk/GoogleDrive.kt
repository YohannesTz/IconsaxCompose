package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GoogleDrive: ImageVector
    get() {
        val current = _googleDrive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GoogleDrive",
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
                moveTo(x = 7.7f, y = 15.71f)
                lineTo(x = 4.59f, y = 21.0f)
                lineToRelative(dx = -3.18f, dy = -5.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 8.41f)
                lineToRelative(dx = -4.3f, dy = 7.3f)
                horizontalLineTo(x = 1.41f)
                lineTo(x = 8.82f, y = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.18f, y = 3.0f)
                lineTo(x = 12.0f, y = 8.41f)
                lineTo(x = 8.82f, y = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.59f, y = 15.63f)
                lineToRelative(dx = -0.06f, dy = 0.08f)
                horizontalLineTo(x = 16.3f)
                lineTo(x = 12.0f, y = 8.41f)
                lineTo(x = 15.18f, y = 3.0f)
                reflectiveCurveToRelative(dx1 = 7.36f, dy1 = 12.63f, dx2 = 7.41f, dy2 = 12.63f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.53f, y = 15.71f)
                curveTo(x1 = 22.11f, y1 = 16.37f, x2 = 19.41f, y2 = 21.0f, x3 = 19.41f, y3 = 21.0f)
                lineToRelative(dx = -3.11f, dy = -5.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.41f, y = 21.0f)
                horizontalLineTo(x = 4.59f)
                lineToRelative(dx = 3.11f, dy = -5.29f)
                horizontalLineToRelative(dx = 8.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.3f, y = 15.71f)
                horizontalLineTo(x = 7.7f)
                lineToRelative(dx = 4.3f, dy = -7.3f)
                close()
            }
        }.build().also { _googleDrive = it }
    }

@Suppress("ObjectPropertyName")
private var _googleDrive: ImageVector? = null
