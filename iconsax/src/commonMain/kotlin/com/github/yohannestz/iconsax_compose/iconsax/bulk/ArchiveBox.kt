package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveBox: ImageVector
    get() {
        val current = _archiveBox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveBox",
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
                moveTo(x = 19.5f, y = 9.97f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.0f, dx2 = -0.5f, dy2 = 3.0f, dx3 = -3.0f, dy3 = 3.0f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.0f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineTo(y = 9.97f)
                lineTo(x = 5.0f, y = 10.0f)
                horizontalLineToRelative(dx = 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 2.75f, dx2 = -2.5f, dy2 = 2.97f)
                lineTo(x = 19.0f, y = 10.0f)
                horizontalLineTo(x = 5.0f)
                lineTo(x = 4.5f, y = 9.97f)
                quadTo(x1 = 2.0f, y1 = 9.75f, x2 = 2.0f, y2 = 7.0f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = 14.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveToRelative(dx = -8.18f, dy = 9.75f)
                horizontalLineToRelative(dx = -3.64f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.64f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _archiveBox = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveBox: ImageVector? = null
