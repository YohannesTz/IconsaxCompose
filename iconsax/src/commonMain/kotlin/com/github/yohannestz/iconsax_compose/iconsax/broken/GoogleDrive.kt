package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.47f, y = 8.74f)
                lineTo(x = 1.41f, y = 15.7f)
                lineToRelative(dx = 3.18f, dy = 5.29f)
                horizontalLineToRelative(dx = 14.82f)
                reflectiveCurveToRelative(dx1 = 3.18f, dy1 = -5.45f, dx2 = 3.18f, dy2 = -5.37f)
                reflectiveCurveTo(x1 = 15.18f, y1 = 3.0f, x2 = 15.18f, y2 = 3.0f)
                horizontalLineTo(x = 8.83f)
                lineTo(x = 7.67f, y = 4.99f)
                moveTo(x = 8.82f, y = 3.0f)
                lineToRelative(dx = 10.59f, dy = 18.0f)
                moveTo(x = 15.18f, y = 3.0f)
                lineTo(x = 4.59f, y = 21.0f)
                moveTo(x = 1.5f, y = 15.71f)
                horizontalLineTo(x = 22.0f)
            }
        }.build().also { _googleDrive = it }
    }

@Suppress("ObjectPropertyName")
private var _googleDrive: ImageVector? = null
