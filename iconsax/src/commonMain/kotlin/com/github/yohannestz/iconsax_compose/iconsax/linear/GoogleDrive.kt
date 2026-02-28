package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.2f, y = 3.0f)
                horizontalLineTo(x = 8.8f)
                lineTo(x = 1.4f, y = 15.7f)
                lineTo(x = 4.6f, y = 21.0f)
                horizontalLineToRelative(dx = 14.8f)
                reflectiveCurveToRelative(dx1 = 3.2f, dy1 = -5.5f, dx2 = 3.2f, dy2 = -5.4f)
                reflectiveCurveTo(x1 = 15.2f, y1 = 3.0f, x2 = 15.2f, y2 = 3.0f)
                moveTo(x = 8.8f, y = 3.0f)
                lineToRelative(dx = 10.6f, dy = 18.0f)
                moveTo(x = 15.2f, y = 3.0f)
                lineTo(x = 4.6f, y = 21.0f)
                moveToRelative(dx = -3.1f, dy = -5.3f)
                horizontalLineTo(x = 22.0f)
            }
        }.build().also { _googleDrive = it }
    }

@Suppress("ObjectPropertyName")
private var _googleDrive: ImageVector? = null
